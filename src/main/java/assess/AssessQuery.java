package assess;

import java.util.List;

import assess.deltas.AbstractDeltaClass;
import assess.labelers.LabelingScheme;

public class AssessQuery {
	//TODO
	//Clearly shown original cube query, or cubequery parts
	//Clearly shown benchmark cube query, or cubequery parts
	//Clearly show delta
	//Clearly show labeling scheme
	
	private String targetCube;
	private List<String> parsedGammas;
	private String measurement;
	private String labelingMethod;

	private LabelingScheme labelingScheme;
	private AbstractDeltaClass deltaFunction;
	
	public AssessQuery(
			String targetCube,
			List<String> parsedGammas,
			String measurement) {
		
		//CHECK CORRECTNESS OF PASSED PARAMETERS
		this.targetCube = targetCube;
		this.parsedGammas  = parsedGammas;
		this.measurement = measurement; 

		//validate();
		
		System.out.println("Target Cube: " + targetCube);
		System.out.println("Group By: " + parsedGammas);
		System.out.println("Measurement: " + measurement);

		// TODO: Create a labeling System based on the data below
		System.out.println(java.util.Optional.ofNullable(labelingMethod).orElse("Provided Custom System"));
	}
}
