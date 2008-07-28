/*
 * Copyright 2006-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.batch.integration;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobInstance;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.JobRestartException;

/**
 * @author Dave Syer
 *
 */
public class JobRepositorySupport implements JobRepository {

	/* (non-Javadoc)
	 * @see org.springframework.batch.core.repository.JobRepository#createJobExecution(org.springframework.batch.core.Job, org.springframework.batch.core.JobParameters)
	 */
	public JobExecution createJobExecution(Job job, JobParameters jobParameters)
			throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		return new JobExecution(new JobInstance(0L, jobParameters, job.getName()));
	}

	/* (non-Javadoc)
	 * @see org.springframework.batch.core.repository.JobRepository#getLastStepExecution(org.springframework.batch.core.JobInstance, org.springframework.batch.core.Step)
	 */
	public StepExecution getLastStepExecution(JobInstance jobInstance, Step step) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.springframework.batch.core.repository.JobRepository#getStepExecutionCount(org.springframework.batch.core.JobInstance, org.springframework.batch.core.Step)
	 */
	public int getStepExecutionCount(JobInstance jobInstance, Step step) {
		return 0;
	}

	/* (non-Javadoc)
	 * @see org.springframework.batch.core.repository.JobRepository#saveOrUpdate(org.springframework.batch.core.JobExecution)
	 */
	public void updateJobExecution(JobExecution jobExecution) {
	}

	/* (non-Javadoc)
	 * @see org.springframework.batch.core.repository.JobRepository#saveOrUpdate(org.springframework.batch.core.StepExecution)
	 */
	public void saveOrUpdate(StepExecution stepExecution) {
	}

	/* (non-Javadoc)
	 * @see org.springframework.batch.core.repository.JobRepository#saveOrUpdateExecutionContext(org.springframework.batch.core.StepExecution)
	 */
	public void saveOrUpdateExecutionContext(StepExecution stepExecution) {
	}

}
