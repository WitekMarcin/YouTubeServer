package org.youtubeserver.model;

/**
 * Created by Marcin on 04.04.2017.
 */
public enum TypeOfTask {

    ADD_COMMENTS(0),
    ADD_LIKES(1),
    MAKE_DISPLAYS(2);

    private int typeOfTask;

    TypeOfTask(int typeOfTask) {
        this.typeOfTask = typeOfTask;
    }

    public int getTypeOfTask() {
        return typeOfTask;
    }
}
