package Chapter11.Exercise11_2Folder;

public class Staff {
        private String title;
    
        public Staff(String title) {
            this.title = title;
        }
        public Staff(String name, String address, String phone,  
            String email, int office, double salary, String title) {
            super();
            this.title = title;
        }
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public String toString() {
            return super.toString() + "\nTitle: " + title;
        }
}
