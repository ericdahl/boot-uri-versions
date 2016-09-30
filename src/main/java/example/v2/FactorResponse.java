package example.v2;

import java.util.List;

public class FactorResponse {


    private final List<Integer> results;
    private final Stats stats;

    public FactorResponse(List<Integer> results, long timeTaken) {
        this.results = results;
        this.stats = new Stats(timeTaken);
    }

    public List<Integer> getResults() {
        return results;
    }

    public Stats getStats() {
        return stats;
    }

    private static class Stats {
        private final long timeTaken;

        private Stats(long timeTaken) {
            this.timeTaken = timeTaken;
        }

        public long getTimeTaken() {
            return timeTaken;
        }
    }
}
