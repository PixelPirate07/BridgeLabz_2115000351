class Movie {
    String title;
    String director;
    int yearOfRelease;
    double rating;
    Movie next;
    Movie prev;
    public Movie(String title,String director,int yearOfRelease,double rating){
        this.title=title;
        this.director=director;
        this.yearOfRelease = yearOfRelease;
        this.rating=rating;
        this.next=null;
        this.prev=null;
    }
}
class MovieList{
    Movie head;
    Movie tail;
    public MovieList(){
        head=null;
        tail=null;
    }
    public void addMovieAtBeginning(String title,String director,int yearOfRelease,double rating){
        Movie newMovie=new Movie(title,director,yearOfRelease,rating);
        if (head==null){
            head=tail=newMovie;
        } 
        else{
            newMovie.next=head;
            head.prev=newMovie;
            head=newMovie;
        }
    }
    public void addMovieAtEnd(String title,String director,int yearOfRelease,double rating){
        Movie newMovie=new Movie(title,director,yearOfRelease,rating);
        if(head==null){
            head=tail=newMovie;
        } 
        else{
            tail.next=newMovie;
            newMovie.prev=tail;
            tail=newMovie;
        }
    }
    public void addMovieAtPosition(String title,String director,int yearOfRelease,double rating,int position){
        Movie newMovie=new Movie(title,director,yearOfRelease,rating);
        if(position==1){
            addMovieAtBeginning(title,director,yearOfRelease,rating);
            return;
        }
        Movie temp=head;
        int count=1;
        while (temp!=null && count<position-1){
            temp=temp.next;
            count++;
        }
        if(temp==null){
            System.out.println("Position out of range");
            return;
        }
        newMovie.next=temp.next;
        newMovie.prev=temp;
        if(temp.next!=null){
            temp.next.prev=newMovie;
        }
        temp.next=newMovie;
        if(newMovie.next==null){
            tail=newMovie;
        }
    }
    public void removeMovieByTitle(String title){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Movie temp=head;
        while (temp!=null){
            if (temp.title.equals(title)){
                if(temp.prev!=null){
                    temp.prev.next=temp.next;
                } 
                else{
                    head=temp.next;
                }
                if(temp.next!=null){
                    temp.next.prev=temp.prev;
                } 
                else{
                    tail=temp.prev;
                }
                System.out.println("Movie '"+title+"' removed");
                return;
            }
            temp=temp.next;
        }

        System.out.println("Movie not found");
    }
    public void searchMovieByDirectorOrRating(String director,Double rating){
        Movie temp=head;
        while(temp!=null){
            if(temp.director.equals(director) || temp.rating==rating){
                System.out.println("Movie Found: Title is "+temp.title+", Director is "+temp.director+ ", Year is "+temp.yearOfRelease+", Rating is "+temp.rating);
            }
            temp = temp.next;
        }
    }
    public void updateMovieRating(String title,double newRating){
        Movie temp=head;
        while (temp!=null){
            if (temp.title.equals(title)){
                temp.rating=newRating;
                System.out.println("Rating updated for movie is "+title);
                return;
            }
            temp=temp.next;
        }
        System.out.println("Movie not found");
    }
    public void displayMoviesForward(){
        if(head==null){
            System.out.println("No movies to display");
            return;
        }
        Movie temp=head;
        System.out.println("Movies in forward order");
        while(temp!=null){
            System.out.println("Title is "+temp.title + ", Director is "+temp.director+", Year is "+temp.yearOfRelease+", Rating is "+temp.rating);
            temp=temp.next;
        }
    }
    public void displayMoviesReverse(){
        if(tail==null){
            System.out.println("No movies to display");
            return;
        }
        Movie temp=tail;
        System.out.println("Movies in reverse order is");
        while(temp!=null){
            System.out.println("Title is "+temp.title+", Director is "+temp.director+", Year is "+temp.yearOfRelease+", Rating is "+temp.rating);
            temp=temp.prev;
        }
    }
}
public class MovieManagement{
    public static void main(String[] args){
        MovieList movieList=new MovieList();
        movieList.addMovieAtEnd("Avengers Infinity War","Russo Brothers",2018,8.4);
        movieList.addMovieAtEnd("Guardians Of The Galaxy","James Gunn",2014,8);
        movieList.addMovieAtEnd("Interstellar","Christopher Nolan",2014,8.6);
        movieList.addMovieAtBeginning("Cars","Brian Fee",2006,7.3);
        movieList.addMovieAtPosition("Shawshank Redemption","Frank Darabont",1994,9.3,3);
        movieList.displayMoviesForward();
        movieList.displayMoviesReverse();
        movieList.updateMovieRating("Tenet", 8.0);
        movieList.displayMoviesForward();
        movieList.searchMovieByDirectorOrRating("Christopher Nolan", 8.8);
        movieList.removeMovieByTitle("Inception");
        movieList.displayMoviesForward();
    }
}
