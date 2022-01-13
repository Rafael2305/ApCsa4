
/**
 * Write a description of class District here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class District
{
    ArrayList<School> listOfSchools;
    int nextIDnum = 1;
    public District()
    {
        listOfSchools = new ArrayList<School>();
    }
    public void addSchool(School school)
    {
        listOfSchools.add(school);
    }
    
    public void removeSchool(School school)
    {
        int index = -1;
        for (int i = 0; i < listOfSchools.size(); i++)
        {
            if (school.equals(listOfSchools.get(i)))
            {
                index = i;
            }
        }
        
        if(index >= 0){
            listOfSchools.remove(index);
        }
    }
    
    public void testAddSchools(int numOfSchools)
    {
        for (int i = 0; i< numOfSchools; i++)
        {
            addSchool(new School(nextIDnum));
            nextIDnum++;
        }
        for (School school: listOfSchools)
        {
            school.testAddStudent(10);
        }
    }
}
