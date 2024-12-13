public class DiaryEntry {

    private String id;
    private String content;
    
    
    public Diary(String id, String content) {
        this.id = id;
        this.content = content;
    }
    
    public String getId() {
        return id;
    }
    
    public String getContent() {
        return content;
    }

}
