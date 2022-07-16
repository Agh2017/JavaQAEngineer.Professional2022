timeout(60) {
    //agent any
    //указать ноду - сборщик
    node('python-jenkins-slave') {
        stage('Checkout') {
            checkout([
                $class: 'GitSCM',
                branches: [[name: 'refs/heads/Homework_1']],
                doGenerateSubmoduleConfiguration: false,
                submoduleCfg: [],
                useRemoteConfigs: [[credentialsId: 'jenkins', url: 'git@github.com:Agh2017/any.projects.git']]
                    ])
        }
        stage('clean project') {
            script {
                mvn clean
            }
            echo 'cleaned..'
        }
        stage('Running tests') {
            sh """
            mvn test -Dbase.url=${env.BASE_URL}
            """
        }
        post {
            always {
                script {
                    allure([
                            includeProperties: false,
                            jdk: '',
                            properties: [],
                            reportBuildPolicy: 'ALWAYS',
                            results: [[path: 'target/allure-results']]
                    ])
                }
            }
        }
        //можем добавить скрипт, который сформирует отчет и отправит rest запрос в мессенджер
    }
}
