package paramresolver;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;
import services.BaseApi;
import services.PetApi;
import services.UserStoreApi;
import utils.ClassFinder;

import java.lang.annotation.Annotation;
import java.util.List;


public class UserServiceParamResolver implements ParameterResolver {

  private final List<Class<?>> classes = ClassFinder.find("services");

  @Override
  public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {

    boolean isUserServiceClass = false;
    Class<?> type = parameterContext.getParameter().getType();

    if (classes.contains(type)) isUserServiceClass = true;
    return isUserServiceClass;
  }

  @SneakyThrows
  @Override
  public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {

    Object currentObject = parameterContext.getParameter().getType();

   Object object = new UserStoreApi();
//
//    if (StoreApi.class.equals(currentObject)) {
//      object = new StoreApi();
//    } else if (PetApi.class.equals(currentObject)) {
      object = new PetApi();
//    }
    // использовать аннотацию для получения названия класса
//    Class<?> currentClass = parameterContext.getParameter().getType().getAnnotation(ApiClass.class).typeMMM();
//
//    String name = currentClass.getName().toString();
//    Class<?> clazz = Class.forName(name);
//    object = clazz.newInstance();

    System.out.println("==============================");
    System.out.println("extensionContext" + extensionContext.getTestClass()); //class pets.CreatePetTest
    System.out.println("parameterContext  " + parameterContext.getParameter().getType().getName()); //services.PetApi
    //System.out.println("(name)  " + name);
    //System.out.println("currentClass  " + clazz.getName());
    System.out.println("==============================");


    return object;
  }
}
