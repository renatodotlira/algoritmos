package lists;

public class LinkedList {

    private Cell first = null;
    private Cell last = null;
    private int totalEmements = 0;

    public LinkedList(Object...array){
        for (Object o : array){
            this.add(o);
        }
    }

    public LinkedList(){}

    public void addAtBegin(Object element){
        if(totalEmements == 0){
            Cell newCell = new Cell(element);
            first = newCell;
            last = newCell;
        }else{
            Cell newCell = new Cell(element, first);
            first.setPrevious(newCell);
            first = newCell;
        }
        totalEmements++;
    }

    public void add(Object element){
        if(totalEmements == 0){
            this.addAtBegin(element);
        }else{
            Cell newCell = new Cell(element);
            newCell.setPrevious(last);
            last.setNext(newCell);
            last = newCell;
            totalEmements++;
        }
    }

    public boolean isIndexValid(int index){
        return index >= 0 && index < totalEmements;
    }

    public Cell getCell(int index){
        if(!isIndexValid(index))
            throw new IllegalArgumentException("Index not valid.");
        Cell current = first;
        for(int x = 0; x < index; x++){
            current = current.getNext();
        }
        return current;
    }

    public void add(int index, Object element){
        if (index == 0){
            addAtBegin(element);
        }else if(index == totalEmements){
            add(element);
        }else{
            Cell previousCell = this.getCell(index - 1);
            Cell newCell = new Cell(element, previousCell.getNext());
            newCell.setPrevious(previousCell);
            previousCell.getNext().setPrevious(newCell);
            previousCell.setNext(newCell);
            totalEmements++;
        }
    }

    public Object get(int index){ return getCell(index).getElement(); }

    public void remove(int index){
        if (index == 0){
            removeTheFirst();
        }else if(index == totalEmements -1){
            removeTheLast();
        }else{
            Cell previousCell = getCell(index - 1);
            Cell currentCell = previousCell.getNext();
            Cell nextCell = currentCell.getNext();
            previousCell.setNext(nextCell);
            nextCell.setPrevious(previousCell);
            totalEmements--;
        }
    }

    public int size(){return totalEmements;}

    public boolean contains(Object o){
        Cell currentCell = first;
        for(int x = 0; x < totalEmements; x++){
            if(currentCell.getElement().toString().equals(o.toString())){
                return true;
            }
            currentCell = currentCell.getNext();
        }
        return false;
    }

    public String removeTheLast(){
        Cell last = this.last;
        if(totalEmements == 1){
            removeTheLastOne();
            this.last = null;
        }else{

            Cell penultimate = last.getPrevious();
            penultimate.setNext(null);
            totalEmements--;
            this.last = penultimate;
        }
        return last.getElement().toString();
    }

    public String removeTheFirst(){
        Cell first = this.first;
        if(totalEmements == 1){
            removeTheLastOne();
            this.last = null;
        }else{
            this.first.getNext().setPrevious(null);
            this.first = first.getNext();
            totalEmements--;
        }
        return first.getElement().toString();
    }

    @Override
    public String toString(){
        if(this.totalEmements == 0){
            return "[]";
        }
        Cell currentCell = first;
        StringBuilder builder = new StringBuilder("[");
        for(int x = 0; x < totalEmements; x++){
            builder.append(currentCell.getElement());
            builder.append(",");
            currentCell = currentCell.getNext();
        }
        builder.deleteCharAt(builder.length() - 1) ;//removing the last comma
        builder.append("]");
        return builder.toString();
    }

    public void removeTheLastOne(){
        first = null;
        last = null;
        totalEmements--;
    }

    public void swap(int to, int from){
        Cell fromCell = getCell(from);
        int valueCellFrom = (int)fromCell.getElement();
        Cell toCell = getCell(to);
        int valueCellTo = (int)toCell.getElement();
        fromCell.setElement(valueCellTo);
        toCell.setElement(valueCellFrom);
    }

    public boolean smaller(int x, int y) {
        int valueX = (int) get(x);
        int valueY = (int) get(y);
        if(valueX < valueY)
            return true;
        return false;
    }
}
