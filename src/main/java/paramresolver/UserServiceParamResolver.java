package paramresolver;

import lombok.SneakyThrows;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;
import utils.ClassFinder;

import java.util.List;


public class UserServiceParamResolver implements ParameterResolver {

  @Override
  public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {

    final List<Class<?>> classes = ClassFinder.find("services");
    boolean isUserServiceClass = false;
    Class<?> type = parameterContext.getParameter().getType();

    if (classes.contains(type)) isUserServiceClass = true;
    return isUserServiceClass;
  }

  @SneakyThrows
  @Override
  public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {

    Class<?> currentClass = parameterContext.getParameter().getType();
    String name = currentClass.getName();
    Class<?> clazz = Class.forName(name);
    return clazz.getDeclaredConstructor().newInstance();
  }
}
