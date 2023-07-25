package poker;

import org.junit.jupiter.api.Test;

import poker.PlanningPoker.Estimate;
import poker.PlanningPoker.Extremes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

class PlanningPokerTest
{
  Estimate ted    = new Estimate("Ted",   16);
  Estimate barney = new Estimate("Barney", 8);
  Estimate lily   = new Estimate("Lily",   2);
  Estimate robin  = new Estimate("Robin",  4);

  @Test
  void two_estimates_1()
  {
    List<Estimate> list = Arrays.asList(
      ted, barney
    );
    Extremes actual = PlanningPoker.identifyExtremes_1(list);

    var expected = new Extremes(
      barney, ted
    );
    assertEquals(actual, expected);
  }

  @Test
  void three_estimates_1()
  {
    List<Estimate> list = Arrays.asList(
      ted, barney, lily
    );
    Extremes actual = PlanningPoker.identifyExtremes_1(list);

    var expected = new Extremes(
      lily, ted
    );
    assertEquals(actual, expected);
  }

  @Test
  void four_estimates_1()
  {
    List<Estimate> list = Arrays.asList(
      ted, barney, lily, robin
    );
    Extremes actual = PlanningPoker.identifyExtremes_1(list);

    var expected = new Extremes(
      lily, ted
    );
    assertEquals(actual, expected);
  }
}
