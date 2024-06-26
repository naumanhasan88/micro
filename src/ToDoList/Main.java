package ToDoList;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        TaskManagement tm = new TaskManagement();
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Menu : ");
                System.out.println("1. Add Task\n2. View Tasks\n3. delete Tasks\n4. Edit Tasks\n5. exit");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        tm.addTask();
                        break;
                    case 2:
                        tm.viewTask();
                        break;
                    case 3:
                        tm.deleteTask();
                        break;
                    case 4:
                         tm.editTask();
                         break;
                    case 5 :
                        sc.close();
                        System.exit(0);
                        break;      
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Invalid option entered, try again.");
                sc.next();
            }
        }
    }
}
