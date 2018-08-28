package useOfMaps;

import java.util.Map; 
import java.util.Collection; 
import java.util.HashMap; 
import java.util.HashSet; 
	 
	 
public class StudentInfo { 
	 Map<String, Collection<String>> subjects = new HashMap <String, Collection<String>>(); 
	 
	 public void addsubject(String student, String subject) { 
        if (student == null || subject == null) 
			throw new IllegalArgumentException();
	
        Collection<String> setOfsubjects; 
		setOfsubjects = subjects.get(student); 
		if (setOfsubjects == null) { 
			setOfsubjects = new HashSet<>(); 
			subjects.put(student, setOfsubjects); 
        } 
        setOfsubjects.add(subject); 
	 }
	 
	public int numOfSubjectstaken(String student) { 
        if (student == null) 
            throw new IllegalArgumentException(); 
             
        int count = 0; 

		Collection<String> setOfsubjects; 
		if (subjects.containsKey(student)) { 
            setOfsubjects = subjects.get(student); 
			if (setOfsubjects != null) { 
				count = setOfsubjects.size();                
			} 
	    } 
        return count; 
	}
	 
	public int numEnrolled(String course) { 
		if (course == null) 
		   throw new IllegalArgumentException(); 
		                 
		Collection<String> setOfsubjects; 
		int count = 0; 
		for(String a : subjects.keySet()) { 
		setOfsubjects = subjects.get(a); 
			for(String b: setOfsubjects) { 
			   if (b.equals(course)) { 
			       count++; 
			   } 
		    } 
	    } 
	    return count; 
	} 
	
	public Collection<String> printSubjects(String student) { 
		if (student == null) 
			throw new IllegalArgumentException(); 	
			
        Collection<String> setOfsubjects; 
		setOfsubjects = subjects.get(student);
		
		return setOfsubjects;
	}
	
	public boolean hasSubject(String student, String subject) { 
		if (student == null || subject == null) 
			throw new IllegalArgumentException(); 	
			
        Collection<String> setOfsubjects; 
		setOfsubjects = subjects.get(student);
		
		
		if(setOfsubjects != null && setOfsubjects.contains(subject)){ 
	         return true; 
        } 
        return false; 
    } 
	
	
	


	public boolean dropStudentsubject(String student, String subject) { 
		
		Collection<String> setOfsubjects; 
		if (subjects.containsKey(student)) {
	        setOfsubjects = subjects.get(student);  
            for (String course : setOfsubjects) {
				if (subject.equals(course)) { 
					setOfsubjects.remove(subject); 
					return true; 
                }         
			}
		}
		return false;
	}
}

	 
