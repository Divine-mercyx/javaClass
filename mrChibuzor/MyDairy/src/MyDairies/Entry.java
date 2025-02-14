package mrChibuzor.MyDairy.src.MyDairies;

import java.time.LocalDate;

public class Entry {
    private int id;
    private String title;
    private String body;
    private LocalDate date;

    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.date = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("ID: %d\n Title: %s\n Body: %s\n Date: %s", id, title, body, date);
    }

    public void setBody(String body) {
        this.body = body;
    }


}
