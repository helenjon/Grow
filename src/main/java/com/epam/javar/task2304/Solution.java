package com.epam.javar.task2304;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
Inner 3
*/

public class Solution {

    private List<Task> tasks;
    private List<String> names;

    Solution solution = new Solution();
    private DbDataProvider taskDataProvider = new TaskDataProvider();
    private DbDataProvider nameDataProvider = new NameDataProvider();

    public void refresh() {
        Map taskCriteria = MockView.getFakeTaskCriteria();
        System.out.println(taskCriteria.get(0));
        taskDataProvider.refreshAllData(taskCriteria);

        Map nameCriteria = MockView.getFakeNameCriteria();
        nameDataProvider.refreshAllData(nameCriteria);
    }

    private interface DbDataProvider<String> {
        void refreshAllData(Map criteria);
    }

    class Task  {



    }

    private class TaskDataProvider implements DbDataProvider {
        @Override
        public void refreshAllData(Map criteria) {
            solution.refresh();
            tasks = new ArrayList<Task>(criteria.values());
       }
    }

    private class NameDataProvider implements DbDataProvider {
        @Override
        public void refreshAllData(Map nameCriteria) {
            names = new ArrayList<String>(nameCriteria.values());
        }
    }

    public static void main(String[] args) {

    }
}