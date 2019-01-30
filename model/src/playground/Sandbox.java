package playground;
import util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Sandbox {
    public Sandbox() {
        super();
    }
    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr1() {
        return str1;
    }
    private String str1 = "Hello";
    public static void main(String[] args) throws Exception {
        System.out.println("Testing...");
        DBUtil.doDBStuff();
        Map<String,String> map = new HashMap<String,String>();
        List<String> list = new ArrayList<String>();
        Queue<Integer> q = new LinkedList<Integer>();
        Set<String> set = new HashSet<String>();
        PriorityQueue<String> pQ = new PriorityQueue<String>();
    }
}
