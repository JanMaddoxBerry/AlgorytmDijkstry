import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public DirectedEdge(int from, int to, int weight) {
this.from = from;
this.to = to;
this.weight = weight;
}
 
public int from() {
return from;
}
 
public int to() {
return to;
}
 
public long getWeight() {
return weight;
}
