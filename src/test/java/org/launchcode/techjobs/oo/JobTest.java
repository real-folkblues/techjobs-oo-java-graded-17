package org.launchcode.techjobs.oo;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.text.Position;

import static org.junit.jupiter.api.Assertions.*;


public class JobTest {

    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Product tester", job.getName());
        assertTrue(job.getEmployer() instanceof Employer);
        assertEquals("ACME", job.getEmployer().getValue());
        assertTrue(job.getLocation() instanceof Location);
        assertEquals("Desert", job.getLocation().getValue());
        assertTrue(job.getPositionType() instanceof PositionType);
        assertEquals("Quality control", job.getPositionType().getValue());
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", job.getCoreCompetency().getValue());

    }
    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(job1, job2);
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        System.out.println(job.toString());

        String output = job.toString();
        System.out.println("Substring: '" + output.substring(0, 1) + "'");
        assertTrue(output.startsWith(System.lineSeparator()));
        assertTrue(output.endsWith(System.lineSeparator()));


    }

    @Test
    public void testToStringContainsCorrectLabelAndData(){
        Job job = new Job("Web Developer", new Employer("LaunchCode"), new Location("StL"), new PositionType("Back-end developer"),
               new CoreCompetency("Java"));

        String output = job.toString();
        System.out.println(output);

        assertTrue(output.contains("ID: " + job.getId()));
        assertTrue(output.contains("Name: Web Developer"));
        assertTrue(output.contains("Employer: LaunchCode"));
        assertTrue(output.contains("Location: StL"));
        assertTrue(output.contains("Position Type: Back-end developer"));
        assertTrue(output.contains("Core Competency: Java"));


    }
}
//@Test
//    public void testToReturnStringWithBlankBeforeAfter(){
//        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        String output = job.toString();
//        if(output.length() - 1)
//            System.out.println("Data not available");
//}




