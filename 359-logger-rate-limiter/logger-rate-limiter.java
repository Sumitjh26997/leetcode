class Logger {
    private Map<String, Integer> logMap;

    public Logger() {
        logMap = new HashMap<>();
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        if( logMap.containsKey(message) ) {
            if( timestamp >= logMap.get(message) ) {
                logMap.put(message, timestamp + 10);
                return true;
            } else {
                return false;
            }
        } else {
            logMap.put(message, timestamp + 10);
            return true;
        }
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */