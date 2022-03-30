
              Учебный проект студента группы "qa-java-pro-2022-02"



  Documentation
  -------------

  The most up-to-date documentation can be found at no one..

  Release Notes
  -------------

  //TODO.

  

  System Requirements
  -------------------

  JDK:
    1.8 or above 
  Memory:
    No minimum requirement.
  Disk:
    Approximately 10MB is required for the Maven installation itself. In addition to
    that, additional disk space will be used for your local Maven repository. The size
    of your local repository will vary depending on usage but expect at least 500MB.
  Operating System:
    Windows:
      Windows 2000 or above.
    Unix based systems (Linux, Solaris and Mac OS X) and others:
      No minimum requirement.

  Installing and Start
  ----------------

  1. Открыть проект в среде разработки.
  2. Настроить maven и JAVA.
  3. Запустить в командной строке тесты предварительно указав тестовое окружение:
     - mvn test -Pdevelop -Dbrowser=chrome
     - mvn test -Pdevelop -Dbrowser=firefox
     - mvn test -Pproduction -Dbrowser=chrome
     - mvn test -Pproduction -Dbrowser=firefox
     - mvn test -Pdemo -Dbrowser=safary

       Licensing
       ---------

       Please dont see the file called LICENSE.

       Maven URLS
       ----------

       Home Page:          https://maven.apache.org/
       Downloads:          https://maven.apache.org/download.html
       Release Notes:      https://maven.apache.org/docs/history.html
       Mailing Lists:      https://maven.apache.org/mailing-lists.html
       Source Code:        https://gitbox.apache.org/repos/asf/maven.git
       Issue Tracking:     https://issues.apache.org/jira/browse/MNG
       Wiki:               https://cwiki.apache.org/confluence/display/MAVEN/
       Available Plugins:  https://maven.apache.org/plugins/
