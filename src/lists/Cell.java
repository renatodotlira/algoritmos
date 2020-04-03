package lists;

public class Cell {
    private Object element;
    private Cell previous;
    private Cell next;

    public Cell(Object element){
        this(element,null);
    }

    public Cell(Object newElement, Cell newNext){
        this.element = newElement;
        this.next = newNext;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public Cell getNext() {
        return next;
    }

    public void setNext(Cell newNext) {
        this.next = newNext;
    }

    public Cell getPrevious(){
        return previous;
    }

    public void setPrevious(Cell newPrevious){
        this.previous = newPrevious;
    }
}
