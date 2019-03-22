public class Variable {	
    public static void main(String[] args) {

    	byte numberOfProcessors = 1;
    	short totalNumberOfCores = 2;
    	int freeMem = 4;
    	long totalMem = 8;
    	float processorSpeed = 2.3f;
    	double modelId = 14.1d;
    	char generationIntel = 'I';
    	boolean charging = true;

		System.out.println("Generation Intel: " + generationIntel);
		System.out.println("Model ID: " + modelId);
		System.out.println("Charging: " + charging);
		System.out.println("Total Memory: " + totalMem);
		System.out.println("Free Memory: " + freeMem);
		System.out.println("Number Of Processors: " + numberOfProcessors);
		System.out.println("Total Number Of Cores: " + totalNumberOfCores);
        System.out.println("Processor Speed: " + processorSpeed);

    }
}