package assignment2;

import java.util.ArrayList;
public class ListPhoneBook {
    private ArrayList<Entry> book;

    public int size(){
        return this.book.size();
    }

    public void insert(String name, long phoneNumber){
        if(this.book == null){
            this.book = new ArrayList<Entry>();
        }
        this.book.add(new Entry(name, phoneNumber));
    }

    public long find(String name){
        //handle case when the list is empty

        for(int i = 0; i < this.book.size(); ++i){
            Entry entry = this.book.get(i);
            if(entry.name.equals(name)){
                return entry.phoneNumber;
            }
        }
        //handle case when name does not exist
        // for now, returning 0 means not found
        return 0L;
    }

    public class Entry {
        public String name;
        public long phoneNumber;

        public Entry(String name, long phoneNumber){
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }
}
