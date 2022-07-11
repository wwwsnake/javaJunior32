package lesson8;

public class Question {
    private String question;
    private Option[] options = new Option[10];

    public Question() {
    }

    public Question(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Option[] getOptions() {
        return options;
    }

    public void setOptions(Option[] options) {
        this.options = options;
    }

    public void addOption(Option option) {
        for (int i = 0; i < options.length; i++) {
            if (options[i] == null) {
                options[i] = option;
                break; //чтобы занять только 1 ячейку этим вариантом, а не все свободные
            }
        }
    }

    public void addoption(Option... options) { //положить сразу несколько вариантов через ","
        //this - вопрос, которому хотим добавить варианты
        //options - массив входящих вариантов, которые нужно добавить
        //this.options - массив вариантов, которые уже есть
        for (int i = 0; i < options.length; i++) {
            this.addOption(options[i]);
            break;
        }
    }
}
