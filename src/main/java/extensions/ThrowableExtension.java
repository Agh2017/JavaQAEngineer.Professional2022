package extensions;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;

public class ThrowableExtension implements TestExecutionExceptionHandler {

  @Override
  public void handleTestExecutionException(ExtensionContext extensionContext, Throwable e) throws Throwable {
    StackTraceElement[] arr = e.getStackTrace();
    String className = "";
    String methodName = "";
    int lineNumber = 0;

    for (StackTraceElement stackTraceElement : arr) {
      String localClassName = stackTraceElement.getClassName();
      if (localClassName.startsWith("page")) {
        className = localClassName;
        methodName = stackTraceElement.getMethodName();
        lineNumber = stackTraceElement.getLineNumber();
        break;
      }
    }
    String cause = "";
    try {
      cause = e.getCause().toString();
    } catch (NullPointerException e1) {
      cause = e.getMessage();
    }
    StackTraceElement st = new StackTraceElement(className, methodName, "Line", lineNumber);
    StackTraceElement[] stackArray = {st};

    if (e.getClass().getName().contains("NoSuchElementException")) {
      String processedCause = cause.substring(cause.indexOf("Unable to locate"), cause.indexOf("(Session info: "))
              .replaceAll("\\n", "");
      Exception ex = new Exception("org.openqa.selenium.NoSuchElementException: " + processedCause);
      ex.setStackTrace(stackArray);
      throw ex;
    } else if (e.getClass().getName().contains(" ")) {
      AssertionError ae = new AssertionError(cause);
      ae.setStackTrace(stackArray);
      throw ae;
    } else {
      Exception ex = new Exception(e.getClass() + ": " + cause);
      ex.setStackTrace(stackArray);
      throw ex;
    }
  }
}
