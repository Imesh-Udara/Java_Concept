package Theory.DesignPattern.Momento;

public class EditorState {

    private String content;

    public EditorState createState() {
        return new EditorState(content);
    }
    public void restore(EditorState state){
        content = state.getContent();
    }
    public String getContent() {
        return content;
    }


    public EditorState(String content) {
        this.content = content;
    }



}
