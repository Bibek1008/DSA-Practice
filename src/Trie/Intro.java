package Trie;

public class Intro {

    static class Node{

        Node []children;
        boolean eow;

        Node(){

            children=new Node[26];
            for(int i=0;i<26;i++){

                children[i]=null;
            }
            eow=false;
        }
    }
    static Node root=new Node();
    static boolean Search(String word){
        Node temp=root;
        for(int i=0;i<word.length();i++) {
            int idx =word.charAt(i)-'a';
            if (temp.children[idx]==null){
                return false;
            }
            temp=temp.children[idx];
            if(i==word.length()-1 && temp.eow==false){
                return false;
            }


        }
        return true;
    }

    static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;  // mark end of word
    }

    public static int countNode(Node root){

        if(root==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                count+=countNode(root.children[i]);
            }
        }
        return 1+count;
    }

    public static void main(String[] args) {

        String str="ababa";

        for(int i=0;i<str.length();i++){
            String subfix=str.substring(i);
            insert(subfix);
        }
        System.out.println(countNode(root));





    }

}
