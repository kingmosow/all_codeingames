package com.learn.Node;

import java.util.HashMap;


public class FindNetworkEndPoint {

    HashMap<String, Node> nodes = new HashMap<>();

    public class Node {

        int nodeIndex;
        Node nextNode;

        public int getNodeIndex() {
            return this.nodeIndex;
        }

        public void setNodeIndex(int nodeIndex) {
            this.nodeIndex = nodeIndex;
        }

        public Node getNextNode() {
            return this.nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }
    }

    public  int  findNetworkEndpoint(int startNodeId, int[] fromIds, int[] toIds) {

        for (int fromId : fromIds) {
            if (nodes.get(String.valueOf(fromId)) == null ) {
                Node node = new Node();
                node.setNodeIndex(fromId);
                nodes.put(String.valueOf(fromId), node);
            }
        }

        for (int toId : toIds) {
            if (nodes.get(String.valueOf(toId)) == null) {
                Node node = new Node();
                node.setNodeIndex(toId);
                nodes.put(String.valueOf(toId), node);
            }
        }

        int i = 0;
        for (int fromId : fromIds) {
            if (toIds.length != 0) {
                nodes.get(String.valueOf(fromId)).setNextNode(nodes.get(String.valueOf(toIds[i])));
            }
            i++;
        }

        Node finalNode = nodes.get(String.valueOf(startNodeId));
        while (finalNode.getNextNode() != null) {
            if (finalNode.getNextNode() != null
                    && finalNode.getNextNode().getNodeIndex() == startNodeId) {
                break;
            }
            finalNode = finalNode.getNextNode();
        }

        return finalNode.getNodeIndex();
    }

    @org.junit.Test
    public void myTest() {
//    public static void main(String[] args){
        int[] fromIds = {1, 7, 3, 4, 2, 6, 9, 5};
        int[] toIds = {3, 3, 4, 6, 6, 9, 5, 0};
        int startNodeId = 7;
        FindNetworkEndPoint t =new FindNetworkEndPoint();
        int endpointNode = t.findNetworkEndpoint(startNodeId, fromIds, toIds);
        System.out.println(startNodeId + " -> " + endpointNode);

    }

}