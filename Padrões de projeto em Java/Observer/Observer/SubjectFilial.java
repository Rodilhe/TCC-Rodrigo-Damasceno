package Observer;

public interface SubjectFilial {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();


}
