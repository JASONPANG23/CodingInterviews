package top.jasonpang.solution.more.前缀树;

/**
 * Description:
 *
 * @author pangjiesheng
 * Created in  2020/9/3
 */
public class Trie {

    private Node root ;
    public Trie(){
        root = new Node();
    }

    public void insert(String word){
        if(word == null || word.length() == 0){
            return ;
        }
        Node cur = root ;
        char[] pathArr = word.toCharArray();
        for (char path : pathArr){
            cur.pass ++ ;
            int ch = path - 'a';
            if(cur.path[ch] == null){
                cur.path[ch] = new Node();
            }
            cur = cur.path[ch];
        }
        cur.end += 1 ;
    }

    public boolean delete(String word){
        if(search(word) == 0){
            return false ;
        }
        Node cur = root ;
        char[] pathArr = word.toCharArray();
        for (char path : pathArr){
            --cur.pass;
            if(--cur.path[path - 'a'].pass == 0){
                cur.path[path-'a'] = null;
                return true;
            }
        }
        cur.end -= 1;
        return true;
    }

    public int search(String word){
        if(word == null || word.length() == 0){
            return 0;
        }
        Node cur = root ;
        char[] pathArr = word.toCharArray();
        for(char path : pathArr){
            if(cur.path[path - 'a'] == null){
                return 0;
            }
            cur = cur.path[path - 'a'];
        }
        return cur.end;
    }

    public int prefixNumber(String word){
        if(word == null || word.length() == 0){
            return 0;
        }
        Node cur = root ;
        char[] pathArr = word.toCharArray();
        for(char path : pathArr){
            if(cur.path[path - 'a'] == null){
                return 0;
            }
            cur = cur.path[path - 'a'];
        }
        return cur.pass ;
    }


    private static class Node{
        public int pass ;
        public int end ;
        private Node[] path;
        public Node(){
            path = new Node[26] ;
        }
    }
}
