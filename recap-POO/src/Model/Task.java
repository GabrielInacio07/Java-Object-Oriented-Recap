package Model;

public class Task {

    private String description;
    private boolean completed;

    public Task(String description, boolean completed) {
        this.description = description;
        this.completed = completed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void showDetails(){
        String status = isCompleted() ? "Concluída" : "Pendente";

        System.out.println("Tarefa: " + getDescription() + " - " + status);
    }

    @Override
    public String toString() {
        String status = completed ? "Concluída" : "Pendente";
        return "Tarefa: " + description + " - " + status;
    }
}
