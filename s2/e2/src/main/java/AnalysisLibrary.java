public class AnalysisLibrary {
    public void analyzeInformation(String json) throws Exception {
        if (!validateJSON(json)) {
            throw new Exception("La información no tiene formato JSON");
        }
        System.out.println("Procesando información");
    }
        public boolean validateJSON(String json){
            return true;
        }
    }