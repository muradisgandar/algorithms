package aziidatastructuredersi.mellimeninexamplellari;

public class Linkedlist {

    /**
     * @param args the command line arguments
     */
    private int data;
    private Linkedlist link;

    public Linkedlist(int initialData, Linkedlist initialLink) {
        data = initialData;
        link = initialLink;

    }

    public int getData() {
        return data;
    }

    public Linkedlist getLink() {
        return link;
    }

    public void setData(int newdata) {
        data = newdata;
    }

    public void setLink(Linkedlist newlink) {
        link = newlink;
    }

    public void addNodeAfter(int element) {
        link = new Linkedlist(element, this.link);
    }

    public void removeNodeAfter() {
        link = link.link;
    }

    public static int listLength(Linkedlist head) {
        Linkedlist cursor;
        int answer;
        answer = 0;

        for (cursor = head; cursor != null; cursor = cursor.link) {
            answer++;
        }

        return answer;
    }

    public static Linkedlist listSearch(Linkedlist head, int target) {
        Linkedlist cursor;

        for (cursor = head; cursor != null; cursor = cursor.link) {
            if (target == cursor.data) {
                return cursor;
            }
        }

        return null;

    }

    public static String printList(Linkedlist list){
        if(list!=null)
            return printList(list.link)+ "->" + list.data ;
        return "";
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Linkedlist small;
        small = new Linkedlist(5, null);
        small.addNodeAfter(6);
        small.addNodeAfter(7);
        small.addNodeAfter(8);
        small.addNodeAfter(9);
        //small.setData(10);
        //small.removeNodeAfter();

        System.out.println(printList(small));

        System.out.println(small.data);
        System.out.println(small.link.data);
        System.out.println(small.link.link.data);
        System.out.println(small.link.link.link.data);
        System.out.println(small.link.link.link.link.data);

    }

}
