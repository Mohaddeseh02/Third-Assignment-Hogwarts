public class TeacherRequest
{
    protected String userName;
    protected String owlmail;
    protected String password;
    protected String fullName;

    public TeacherRequest(String userName, String owlmail, String password, String fullName)
    {
        this.userName = userName;
        this.owlmail    = owlmail;
        this.password = password;
        this.fullName = fullName;
    }

    public void addRequest (TeacherRequest professorRequest)
    {
        Assistant.allProfessorRequests.add (professorRequest);
    }

    public static TeacherRequest findRequest (String fullName)
    {
        for (TeacherRequest professorRequest : Assistant.allProfessorRequests)
        {
            if (professorRequest.fullName.equals (fullName))
            {
                return professorRequest;
            }
        }
        return null;
    }
}
