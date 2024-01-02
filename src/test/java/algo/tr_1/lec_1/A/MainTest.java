package algo.tr_1.lec_1.A;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  public void heatBaseTest() {
    int result = Main.calculateTemperature(10, 20, "heat");
    assertEquals(20, result);
  }

  @Test
  public void heatIncreaseOnlyTest() {
    int result = Main.calculateTemperature(10, 5, "heat");
    assertEquals(10, result);
  }

  @Test
  public void heatMoreOrEqualsTest() {
    int result = Main.calculateTemperature(10, 10, "heat");
    assertEquals(10, result);
  }

  @Test
  public void heatOneLessTest() {
    int result = Main.calculateTemperature(10, 9, "heat");
    assertEquals(10, result);
  }

  @Test
  public void heatOneMoreTest() {
    int result = Main.calculateTemperature(10, 11, "heat");
    assertEquals(11, result);
  }

  @Test
  public void heatNegativeTest() {
    int result = Main.calculateTemperature(-10, 9, "heat");
    assertEquals(9, result);
  }

  @Test
  public void heatZeroTest() {
    int result = Main.calculateTemperature(-10, 0, "heat");
    assertEquals(0, result);
  }

  @Test
  public void heatReverseNegativeTest() {
    int result = Main.calculateTemperature(-10, -20, "heat");
    assertEquals(-10, result);
  }

  @Test
  public void freezeBaseTest() {
    int result = Main.calculateTemperature(10, 20, "freeze");
    assertEquals(10, result);
  }

  @Test
  public void freezeDecreaseOnlyTest() {
    int result = Main.calculateTemperature(10, 20, "freeze");
    assertEquals(10, result);
  }

  @Test
  public void freezeLessOrEqualsTest() {
    int result = Main.calculateTemperature(10, 10, "freeze");
    assertEquals(10, result);
  }

  @Test
  public void freezeOneLessTest() {
    int result = Main.calculateTemperature(10, 9, "freeze");
    assertEquals(9, result);
  }

  @Test
  public void freezeOneMoreTest() {
    int result = Main.calculateTemperature(10, 11, "freeze");
    assertEquals(10, result);
  }

  @Test
  public void freezeNegativeTest() {
    int result = Main.calculateTemperature(-10, -40, "freeze");
    assertEquals(-40, result);
  }

  @Test
  public void freezeZeroTest() {
    int result = Main.calculateTemperature(10, 0, "freeze");
    assertEquals(0, result);
  }

  @Test
  public void freezeReverseNegativeTest() {
    int result = Main.calculateTemperature(-10, 20, "freeze");
    assertEquals(-10, result);
  }

  @Test
  public void autoBaseTest() {
    int result = Main.calculateTemperature(10, 20, "auto");
    assertEquals(20, result);
  }

  @Test
  public void autoOneLessTest() {
    int result = Main.calculateTemperature(10, 9, "auto");
    assertEquals(9, result);
  }

  @Test
  public void autoOneMoreTest() {
    int result = Main.calculateTemperature(10, 11, "auto");
    assertEquals(11, result);
  }

  @Test
  public void autoNegativeTest() {
    int result = Main.calculateTemperature(-10, 9, "auto");
    assertEquals(9, result);
  }

  @Test
  public void autoZeroTest() {
    int result = Main.calculateTemperature(-10, 0, "auto");
    assertEquals(0, result);
  }

  @Test
  public void funBaseTest() {
    int result = Main.calculateTemperature(10, 20, "fan");
    assertEquals(10, result);
  }

  @Test
  public void funOneLessTest() {
    int result = Main.calculateTemperature(10, 9, "fan");
    assertEquals(10, result);
  }

  @Test
  public void funOneMoreTest() {
    int result = Main.calculateTemperature(10, 11, "fan");
    assertEquals(10, result);
  }

  @Test
  public void funNegativeTest() {
    int result = Main.calculateTemperature(-10, 9, "fan");
    assertEquals(-10, result);
  }

  @Test
  public void funZeroTest() {
    int result = Main.calculateTemperature(-10, 0, "fan");
    assertEquals(-10, result);
  }

  @Test
  public void wrongModeTest() {
    assertThrows(RuntimeException.class, () -> Main.calculateTemperature(10, 20, "foo"));
  }
}