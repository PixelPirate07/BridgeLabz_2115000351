class Task{
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;
    public Task(int taskId, String taskName, int priority, String dueDate){
        this.taskId=taskId;
        this.taskName=taskName;
        this.priority=priority;
        this.dueDate=dueDate;
        this.next=null;
    }
}
class TaskScheduler{
    Task head;
    public TaskScheduler(){
        head=null;
    }
    public void addTaskAtBeginning(int taskId, String taskName, int priority, String dueDate){
        Task newTask=new Task(taskId, taskName, priority, dueDate);
        if(head==null){
            head=newTask;
            newTask.next=head;
        } 
        else{
            Task temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=newTask;
            newTask.next=head;
            head=newTask;
        }
    }
    public void addTaskAtEnd(int taskId,String taskName,int priority,String dueDate){
        Task newTask = new Task(taskId,taskName,priority,dueDate);
        if(head==null){
            head=newTask;
            newTask.next=head;
        } 
        else{
            Task temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next = newTask;
            newTask.next = head;
        }
    }
    public void addTaskAtPosition(int taskId, String taskName, int priority, String dueDate, int position){
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if(position == 1){
            addTaskAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        Task temp = head;
        int count = 1;
        while(temp != null && count < position - 1){
            temp = temp.next;
            count++;
        }
        if(temp == null || temp.next == head){
            System.out.println("Position out of range");
            return;
        }
        newTask.next = temp.next;
        temp.next = newTask;
    }
    public void removeTaskById(int taskId){
        if(head == null){
            System.out.println("Task list is empty.");
            return;
        }
        if(head.taskId == taskId){
            if(head.next == head){
                head = null;
            } else {
                Task temp = head;
                while(temp.next != head){
                    temp = temp.next;
                }
                temp.next = head.next;
                head = head.next;
            }
            System.out.println("Task with ID " + taskId + " has been removed.");
            return;
        }
        Task temp = head;
        while(temp.next != head && temp.next.taskId != taskId){
            temp = temp.next;
        }
        if(temp.next == head){
            System.out.println("Task with ID " + taskId + " not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Task with ID " + taskId + " has been removed.");
        }
    }
    public void viewNextTask(){
        if(head == null){
            System.out.println("No tasks available.");
            return;
        }
        Task temp = head;
        do{
            System.out.println("Task ID: " + temp.taskId + ", Task Name: " + temp.taskName + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp=temp.next;
        } while(temp!=head);
    }
    public void displayAllTasks(){
        if(head==null){
            System.out.println("Task list is empty");
            return;
        }
        Task temp=head;
        do{
            System.out.println("Task ID is "+temp.taskId+", Task Name is "+temp.taskName+",Priority is "+temp.priority+", Due Date "+temp.dueDate);
            temp=temp.next;
        } while(temp!=head);
    }
    public void searchTaskByPriority(int priority){
        if(head==null){
            System.out.println("Task list is empty");
            return;
        }
        Task temp=head;
        boolean found=false;
        do{
            if(temp.priority==priority){
                System.out.println("Task Found: Task ID is "+temp.taskId+", Task Name is "+temp.taskName+", Priority is "+temp.priority+", Due Date is "+temp.dueDate);
                found=true;
            }
            temp=temp.next;
        } while(temp!=head);
        if(!found){
            System.out.println("No task found with the priority "+priority);
        }
    }
}
public class TaskApp{
    public static void main(String[] args){
        TaskScheduler scheduler=new TaskScheduler();
        scheduler.addTaskAtEnd(1,"Complete Project",1,"2025-03-01");
        scheduler.addTaskAtEnd(2,"Submit Report",2,"2025-02-20");
        scheduler.addTaskAtEnd(3,"Meeting with client",3,"2025-02-15");
        System.out.println("All Tasks");
        scheduler.displayAllTasks();
        System.out.println("\nViewing tasks in circular manner");
        scheduler.viewNextTask();
        scheduler.addTaskAtBeginning(4,"Prepare presentation",1,"2025-02-10");
        System.out.println("\nTasks after adding a task at the beginning");
        scheduler.displayAllTasks();
        scheduler.addTaskAtPosition(5,"Review code",3,"2025-02-18",2);
        System.out.println("\nTasks after adding a task at position 2");
        scheduler.displayAllTasks();
        scheduler.removeTaskById(3);
        System.out.println("\nTasks after removing task with ID 3");
        scheduler.displayAllTasks();
        System.out.println("\nSearching for tasks with priority 1");
        scheduler.searchTaskByPriority(1);
    }
}
