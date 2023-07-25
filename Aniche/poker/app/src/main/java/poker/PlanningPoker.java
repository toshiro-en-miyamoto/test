package poker;
import java.util.List;

public interface PlanningPoker
{
  record Estimate(
    String name,
    int effort
  ) {}

  record Extremes(
    Estimate lowest,
    Estimate highest
  ) {}

  static Extremes identifyExtremes_1(List<Estimate> estimates)
  {
    Estimate lowestEstimate = null;
    Estimate highestEstimate = null;

    for (var estimate : estimates) {
      if (highestEstimate == null ||
          estimate.effort() > highestEstimate.effort())
      {
          highestEstimate = estimate;
      }
      else if (lowestEstimate == null ||
          estimate.effort() < lowestEstimate.effort())
      {
        lowestEstimate = estimate;
      }

    }

    return new Extremes(lowestEstimate, highestEstimate);
  }
}
