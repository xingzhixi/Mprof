package dataflow.model.job;

import java.util.List;

import dataflow.model.mapper.Mapper;
import dataflow.model.reducer.Reducer;
import profile.job.JobProfile;
import profile.profiler.JobProfileFromSerialization;

public class JobDataflowModelBuilder {
   
    
    public static void main(String[] args) {
	String jobId = "job_201404061331_0008";

	String serializeDir = "/Users/xulijie/Documents/DiagOOMSpace/Test/";

	JobProfile jobProfile = JobProfileFromSerialization.deserialization(serializeDir, jobId);

	Job job = buildDataflow(jobProfile);
	
	
	System.out.println("## Mapper");
	System.out.println(job.getMappers().get(0));
	
	System.out.println("\n## Reducer");
	System.out.println(job.getReducers().get(0));
	
    }

    public static Job buildDataflow(JobProfile jobProfile) {
	List<Mapper> mappers = MapperDataflowBuilder.build(jobProfile);
	List<Reducer> reducers = ReducerDataflowBuilder.build(jobProfile, mappers);
	
	Job job = new Job();
	job.setMappsers(mappers);
	job.setReducers(reducers);
	
	return job;
    }

}