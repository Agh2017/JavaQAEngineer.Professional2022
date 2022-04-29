package paramresolver;

import dto.users.UserStore;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;
import services.PetApi;
import services.StoreApi;
import services.UserStoreApi;

public class UserServiceParamResolver implements ParameterResolver {

  @Override
  public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
    boolean isUserServiceClass;
    Class<?> type = parameterContext.getParameter().getType();
    isUserServiceClass = StoreApi.class.equals(type) || PetApi.class.equals(type) || UserStoreApi.class.equals(type);
    return isUserServiceClass;
  }

  @Override
  public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
    Object object = new StoreApi();
    Object currentObject = parameterContext.getParameter().getType();
    if (StoreApi.class.equals(currentObject)) {
      object = new StoreApi();
    } else if (PetApi.class.equals(currentObject)) {
      object = new PetApi();
    } else if (UserStoreApi.class.equals(currentObject)) {
      object = new UserStoreApi();
    }
    return object;
  }
}
