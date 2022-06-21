package services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;

import mock.data.Student;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import mock.service.api.IApiService;
import mock.service.finder.Finder;
import mock.service.finder.IFind;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

@ExtendWith(MockitoExtension.class)
public class FinderMock_Test {

  @Mock
  private IApiService mockApiService;

  @Test
  public void test_finder_real_objects() {
    List<Student> students = new ArrayList<>();
    students.add(new Student("Pasha", 33));
    students.add(new Student("Sasha", 40));

    IFind<Student> finder = new Finder<>(students, (Student student) ->  student.getName().equals("Pasha"));
    Student result = finder.search();

    assertThat(result).extracting(Student::getName).isEqualTo("Pasha");
    assertThat(result).extracting(Student::getAge).isEqualTo(33);
  }

  @Test
  public void test_finder_dummy_mock_object() {
    List mockStudent = Mockito.mock(List.class);

    IFind<Student> finder = new Finder<>(mockStudent, student -> true);
    Student result = finder.search();
    //пустышку сделали, так как не указали доп условий
    assertThat(result).as("").isNull();
  }

  @Test
  public void test_finder_stub() {
    Student expectedStudent = new Student("Sasha", 46);

    // мокаем интерфейс классa Finder, передаем ему интерфейс или класс, реализующий интерфейс
    IFind<Student> mockFinder = Mockito.mock(Finder.class);

    //когда мы вызываем метод search, верни этого студента.
    Mockito.when(mockFinder.search()).thenReturn(expectedStudent);

    Student result = mockFinder.search();

    assertThat(result).extracting(Student::getName).isEqualTo("Sasha");
    assertThat(result).extracting(Student::getAge).isEqualTo(45);
  }

  @Test
  public void test_method_params_any() {
    //метод isItemFound принимает некий предикат с любыми параметрами "any - любой тип", затем возвращаем какое-то значение, например true
    //пишем тесты заранее, когда еще нет даже интерфейсов...
    Mockito.when(mockApiService.isItemFound(any())).thenReturn(true);

    assertThat(mockApiService.isItemFound(null)).isFalse();
  }

  @Test
  public void test_method_params_eq() {
    //argThat проверяет условия: аргумент !=null и длина строки не больше 3, тогда возвращаем это..
    //если условия не выполнены, то тест пойдет дальше, н-р, взаимодействовать с реальной системой
    Mockito.when(mockApiService.isItemFound(Mockito.argThat(arg -> arg != null && arg.toString().length() < 3))).thenReturn(true);
    assertThat(mockApiService.isItemFound(test -> false)).isTrue();
  }
}
