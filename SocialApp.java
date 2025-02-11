class Friend{
    int friendId;
    Friend next;
    public Friend(int friendId){
        this.friendId=friendId;
        this.next=null;
    }
}
class User{
    int userId;
    String name;
    int age;
    Friend friends;
    User next;
    public User(int userId,String name,int age){
        this.userId=userId;
        this.name=name;
        this.age=age;
        this.friends=null;
        this.next=null;
    }
}
class SocialMedia{
    User head;
    public SocialMedia(){
        head=null;
    }
    public void addUser(int userId, String name, int age){
        User newUser=new User(userId, name, age);
        if(head==null){
            head= newUser;
        } else {
            User temp=head;
            while(temp.next != null){
                temp=temp.next;
            }
            temp.next=newUser;
        }
    }
    public void addFriend(int userId1,int userId2){
        User user1=findUserById(userId1);
        User user2=findUserById(userId2);
        if(user1!=null && user2!=null){
            Friend newFriend1=new Friend(userId2);
            newFriend1.next=user1.friends;
            user1.friends=newFriend1;
            Friend newFriend2=new Friend(userId1);
            newFriend2.next=user2.friends;
            user2.friends=newFriend2;
        }
    }
    public void removeFriend(int userId1,int userId2){
        User user1=findUserById(userId1);
        User user2=findUserById(userId2);
        if(user1!=null && user2!=null){
            removeFriendFromUser(user1,userId2);
            removeFriendFromUser(user2,userId1);
        }
    }
    private void removeFriendFromUser(User user, int friendId){
        Friend temp=user.friends;
        Friend prev=null;
        while(temp!=null){
            if(temp.friendId==friendId){
                if(prev==null){
                    user.friends=temp.next;
                } 
                else{
                    prev.next=temp.next;
                }
                break;
            }
            prev=temp;
            temp=temp.next;
        }
    }
    public User findUserById(int userId){
        User temp=head;
        while(temp!=null){
            if(temp.userId==userId){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public User findUserByName(String name){
        User temp=head;
        while(temp!=null){
            if(temp.name.equals(name)){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public void displayFriends(int userId){
        User user=findUserById(userId);
        if(user!=null){
            Friend temp=user.friends;
            System.out.print("Friends of " + user.name);
            while(temp!=null){
                User friend=findUserById(temp.friendId);
                if(friend!=null){
                    System.out.print(friend.name+" ");
                }
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public void findMutualFriends(int userId1,int userId2){
        User user1=findUserById(userId1);
        User user2=findUserById(userId2);
        if(user1!=null && user2!=null){
            Friend temp1=user1.friends;
            while(temp1!=null){
                Friend temp2=user2.friends;
                while(temp2!=null){
                    if(temp1.friendId==temp2.friendId){
                        User mutualFriend=findUserById(temp1.friendId);
                        if(mutualFriend!=null){
                            System.out.print(mutualFriend.name+" ");
                        }
                    }
                    temp2=temp2.next;
                }
                temp1=temp1.next;
            }
            System.out.println();
        }
    }
    public void countFriends(int userId){
        User user=findUserById(userId);
        if(user!=null){
            int count=0;
            Friend temp=user.friends;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            System.out.println(user.name+" has "+count+" friends");
        }
    }
}
public class SocialApp{
    public static void main(String[] args){
        SocialMedia sm = new SocialMedia();
        sm.addUser(1,"Abc",25);
        sm.addUser(2,"Xyz",30);
        sm.addUser(3,"Jon",28);
        sm.addUser(4,"Steve",27);
        sm.addFriend(1,2);
        sm.addFriend(1,3);
        sm.addFriend(2,4);
        sm.addFriend(3,4);
        sm.displayFriends(1);
        sm.findMutualFriends(1,2);
        sm.removeFriend(1,3);
        sm.displayFriends(1);
        sm.countFriends(1);
    }
}
