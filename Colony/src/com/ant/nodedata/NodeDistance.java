/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ant.nodedata;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import javax.swing.JButton;

/**
 *
 * @author Thilina Thushantha
 */
public class NodeDistance {

    Map<String, Integer> map = new HashMap<String, Integer>();
    Map<String, Integer> setValueToNode = new HashMap<String, Integer>();
    String[] nodeValues = new String[26];

    public String nodeDistance(JButton node1, JButton node2, JButton node3, JButton node4, JButton node5, JButton node6, JButton node7, JButton node8, JButton node9, JButton node10,
            JButton node11, JButton node12, JButton node13, JButton node14, JButton node15, JButton node16, JButton node17, JButton node18, JButton node19, JButton node20,
            JButton node21, JButton node22, JButton node23, JButton node24, JButton node25) {

        map.put("node1", 1);
        map.put("node2", 1);
        map.put("node3", 1);
        map.put("node4", 1);
        map.put("node5", 1);
        map.put("node6", 1);
        map.put("node7", 1);
        map.put("node8", 1);
        map.put("node9", 1);
        map.put("node10", 1);
        map.put("node11", 1);
        map.put("node12", 1);
        map.put("node13", 1);
        map.put("node14", 1);
        map.put("node15", 1);
        map.put("node16", 1);
        map.put("node17", 1);
        map.put("node18", 1);
        map.put("node19", 1);
        map.put("node20", 1);
        map.put("node21", 1);
        map.put("node22", 1);
        map.put("node23", 1);
        map.put("node24", 1);
        map.put("node25", 1);

        int colonyRandom = (int) (Math.random() * 25 + 1);
        int foodRandom = (int) (Math.random() * 25 + 1);

        if (colonyRandom == 1) {
            nodeValues[1] = "COLONY";
            node1.setText("COLONY");
        } else if (colonyRandom == 2) {
            nodeValues[2] = "COLONY";
            node2.setText("COLONY");
        } else if (colonyRandom == 3) {
            nodeValues[3] = "COLONY";
            node3.setText("COLONY");
        } else if (colonyRandom == 4) {
            nodeValues[4] = "COLONY";
            node4.setText("COLONY");
        } else if (colonyRandom == 5) {
            nodeValues[5] = "COLONY";
            node5.setText("COLONY");
        } else if (colonyRandom == 6) {
            nodeValues[6] = "COLONY";
            node6.setText("COLONY");
        } else if (colonyRandom == 7) {
            nodeValues[7] = "COLONY";
            node7.setText("COLONY");
        } else if (colonyRandom == 8) {
            nodeValues[8] = "COLONY";
            node8.setText("COLONY");
        } else if (colonyRandom == 9) {
            nodeValues[9] = "COLONY";
            node9.setText("COLONY");
        } else if (colonyRandom == 10) {
            nodeValues[10] = "COLONY";
            node10.setText("COLONY");
        } else if (colonyRandom == 11) {
            nodeValues[11] = "COLONY";
            node11.setText("COLONY");
        } else if (colonyRandom == 12) {
            nodeValues[12] = "COLONY";
            node12.setText("COLONY");
        } else if (colonyRandom == 13) {
            nodeValues[13] = "COLONY";
            node13.setText("COLONY");
        } else if (colonyRandom == 14) {
            nodeValues[14] = "COLONY";
            node14.setText("COLONY");
        } else if (colonyRandom == 15) {
            nodeValues[15] = "COLONY";
            node15.setText("COLONY");
        } else if (colonyRandom == 16) {
            nodeValues[16] = "COLONY";
            node16.setText("COLONY");
        } else if (colonyRandom == 17) {
            nodeValues[17] = "COLONY";
            node17.setText("COLONY");
        } else if (colonyRandom == 18) {
            nodeValues[18] = "COLONY";
            node18.setText("COLONY");
        } else if (colonyRandom == 19) {
            nodeValues[19] = "COLONY";
            node19.setText("COLONY");
        } else if (colonyRandom == 20) {
            nodeValues[20] = "COLONY";
            node20.setText("COLONY");
        } else if (colonyRandom == 21) {
            nodeValues[21] = "COLONY";
            node21.setText("COLONY");
        } else if (colonyRandom == 22) {
            nodeValues[22] = "COLONY";
            node22.setText("COLONY");
        } else if (colonyRandom == 23) {
            nodeValues[23] = "COLONY";
            node23.setText("COLONY");
        } else if (colonyRandom == 24) {
            nodeValues[24] = "COLONY";
            node24.setText("COLONY");
        } else if (colonyRandom == 25) {
            nodeValues[25] = "COLONY";
            node25.setText("COLONY");
        }

        try {
            for (int i = 0; i < nodeValues.length; i++) {

                if (nodeValues[i] != null) {
                    if (nodeValues[i].equals("COLONY")) {
                        if (colonyRandom == i + 1 || colonyRandom == i - 1 || colonyRandom == i + 5 || colonyRandom == i - 5) {

                        } else {
                            foodRandom = (int) (Math.random() * 25 + 1);
                            System.out.println(foodRandom);
                            nodeValues[foodRandom] = "FOOD";

                            if (foodRandom == 1) {
                                nodeValues[1] = "FOOD";
                                node1.setText("FOOD");
                            } else if (foodRandom == 2) {
                                nodeValues[2] = "FOOD";
                                node2.setText("FOOD");
                            } else if (foodRandom == 3) {
                                nodeValues[3] = "FOOD";
                                node3.setText("FOOD");
                            } else if (foodRandom == 4) {
                                nodeValues[4] = "FOOD";
                                node4.setText("FOOD");
                            } else if (foodRandom == 5) {
                                nodeValues[5] = "FOOD";
                                node5.setText("FOOD");
                            } else if (foodRandom == 6) {
                                nodeValues[6] = "FOOD";
                                node6.setText("FOOD");
                            } else if (foodRandom == 7) {
                                nodeValues[7] = "FOOD";
                                node7.setText("FOOD");
                            } else if (foodRandom == 8) {
                                nodeValues[8] = "FOOD";
                                node8.setText("FOOD");
                            } else if (foodRandom == 9) {
                                nodeValues[9] = "FOOD";
                                node9.setText("FOOD");
                            } else if (foodRandom == 10) {
                                nodeValues[10] = "FOOD";
                                node10.setText("FOOD");
                            } else if (foodRandom == 11) {
                                nodeValues[11] = "FOOD";
                                node11.setText("FOOD");
                            } else if (foodRandom == 12) {
                                nodeValues[12] = "FOOD";
                                node12.setText("FOOD");
                            } else if (foodRandom == 13) {
                                nodeValues[13] = "FOOD";
                                node13.setText("FOOD");
                            } else if (foodRandom == 14) {
                                nodeValues[14] = "FOOD";
                                node14.setText("FOOD");
                            } else if (foodRandom == 15) {
                                nodeValues[15] = "FOOD";
                                node15.setText("FOOD");
                            } else if (foodRandom == 16) {
                                nodeValues[16] = "FOOD";
                                node16.setText("FOOD");
                            } else if (foodRandom == 17) {
                                nodeValues[17] = "FOOD";
                                node17.setText("FOOD");
                            } else if (foodRandom == 18) {
                                nodeValues[18] = "FOOD";
                                node18.setText("FOOD");
                            } else if (foodRandom == 19) {
                                nodeValues[19] = "FOOD";
                                node19.setText("FOOD");
                            } else if (foodRandom == 20) {
                                nodeValues[20] = "FOOD";
                                node20.setText("FOOD");
                            } else if (foodRandom == 21) {
                                nodeValues[21] = "FOOD";
                                node21.setText("FOOD");
                            } else if (foodRandom == 22) {
                                nodeValues[22] = "FOOD";
                                node22.setText("FOOD");
                            } else if (foodRandom == 23) {
                                nodeValues[23] = "FOOD";
                                node23.setText("FOOD");
                            } else if (foodRandom == 24) {
                                nodeValues[24] = "FOOD";
                                node24.setText("FOOD");
                            } else if (foodRandom == 25) {
                                nodeValues[25] = "FOOD";
                                node25.setText("FOOD");
                            }

                        }
                    }

                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

//        Iterator adp = map.values().iterator();
//        while (adp.hasNext()) {
//            //  System.out.println(adp.next());
//
//        }
        return "'";
    }

}
