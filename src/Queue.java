public class Queue {
    private String[] vehicles;
    private int front;
    private int rear;
    private int items;
    private int maxSize;
    Queue(int maxSize)
    {
        this.maxSize = maxSize;
        vehicles = new String[this.maxSize];
        this.front = 0;
        this.rear = -1;
        this.items = 0;
    }
    private boolean isFull()
    {
        return (items == maxSize);
    }

    public void addVehicle(String vehicleNumber)
    {
        if(!isFull())
        {
            if(rear == maxSize)
                rear = -1;
            vehicles[++rear] = vehicleNumber;
            items++;
            System.out.println("Successfully Vehicle added");
        }
        else
        {
            System.out.println("The queue is full");
        }
    }

    private boolean isEmpty() // true if queue is empty
    {
        return (items==0);
    }
    public void removeVehicle(String vehicleNumber)
    {
        if(!isEmpty())
        {
            for(int i = front; i <= rear; i++) {
                if(vehicles[i].equals(vehicleNumber)) {
                    System.arraycopy(vehicles, i + 1, vehicles, i, items);
                    vehicles[rear--] = null;
                    --items;
                    System.out.println(" vehicle removed Successfully");
                    break;
                }
            }
        }
        else
        {
            System.out.println("The queue is Empty");
        }

    }
    public void search(String vehicleName)
    {
        int i,count=0;
        boolean Exsists=false;
        for( i=front;i<= rear;i++) {
            if(vehicleName.equals(vehicles[i])) {
                Exsists=true;
                count++;
                break;
            }
            count++;
        }
        if(Exsists==true) {
            System.out.println("Vehicle "+vehicleName+" is in the queue at No. "+count+" position");
        }else
            System.out.println("vehicle is not in the queue");
    }
    public void displayQueue()
    {
        int count =1;
        for(int i =front; i <= rear ; i++)
        {
            System.out.println(count+". "+vehicles[i]);
            count++;
        }
    }

}

