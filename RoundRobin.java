class Process{
    int processId;
    int burstTime;
    int remainingTime;
    int priority;
    Process next;
    public Process(int processId,int burstTime,int priority){
        this.processId=processId;
        this.burstTime=burstTime;
        this.remainingTime=burstTime;
        this.priority=priority;
        this.next=null;
    }
}
class RoundRobinScheduler{
    Process head;
    public RoundRobinScheduler(){
        head=null;
    }
    public void addProcess(int processId, int burstTime, int priority){
        Process newProcess = new Process(processId, burstTime, priority);
        if(head==null){
            head=newProcess;
            newProcess.next=head;
        }
        else{
            Process temp = head;
            while(temp.next != head){
                temp = temp.next;
            }
            temp.next = newProcess;
            newProcess.next = head;
        }
    }
    public void removeProcess(int processId){
        if(head == null){
            System.out.println("No process to remove.");
            return;
        }
        if(head.processId == processId){
            if(head.next == head){
                head = null;
            } else {
                Process temp = head;
                while(temp.next != head){
                    temp = temp.next;
                }
                temp.next = head.next;
                head = head.next;
            }
            return;
        }
        Process temp=head;
        while(temp.next!=head && temp.next.processId!=processId){
            temp=temp.next;
        }
        if(temp.next==head){
            System.out.println("Process not found.");
        } 
        else{
            temp.next=temp.next.next;
        }
    }
    public void roundRobinScheduling(int timeQuantum){
        if(head==null){
            System.out.println("No processes to schedule.");
            return;
        }
        Process temp=head;
        int totalWaitingTime=0;
        int totalTurnaroundTime=0;
        int count=0;
        while(count<1000){
            if(temp.remainingTime>0){
                if(temp.remainingTime<=timeQuantum){
                    totalTurnaroundTime+=timeQuantum-temp.remainingTime;
                    totalWaitingTime+=totalTurnaroundTime-temp.burstTime;
                    temp.remainingTime=0;
                    System.out.println("Process "+temp.processId+" completed");
                    removeProcess(temp.processId);
                    count++;
                } 
                else{
                    totalTurnaroundTime+=timeQuantum;
                    totalWaitingTime+=totalTurnaroundTime-temp.burstTime;
                    temp.remainingTime-=timeQuantum;
                    System.out.println("Process "+temp.processId+" executed for "+timeQuantum+" units");
                }
            }
            temp=temp.next;
            if(temp==head){
                break;
            }    
        }
        if(count > 0){
            System.out.println("Average Waiting Time is "+(totalWaitingTime/count));
            System.out.println("Average Turnaround Time is "+(totalTurnaroundTime/count));
        }
    }
    public void displayProcesses(){
        if(head==null){
            System.out.println("No processes in the queue");
            return;
        }
        Process temp=head;
        while(temp!=null){
            System.out.println("Process ID is "+temp.processId+", Burst Time is "+temp.burstTime+", Remaining Time is "+temp.remainingTime);
            temp=temp.next;
            if(temp==head){
                break;
            }    
        }
    }
}
public class RoundRobin{
    public static void main(String[] args){
        RoundRobinScheduler scheduler=new RoundRobinScheduler();
        scheduler.addProcess(1,10,1);
        scheduler.addProcess(2,5,2);
        scheduler.addProcess(3,8,3);
        scheduler.addProcess(4,6,1);
        System.out.println("Initial Process List is");
        scheduler.displayProcesses();
        scheduler.roundRobinScheduling(4);
    }
}
