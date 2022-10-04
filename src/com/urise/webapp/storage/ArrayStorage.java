package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage extends AbstractArrayStorage {

    @Override
    public void deleteResume(int index) {
        storage[index] = storage[size - 1];
    }

    @Override
    protected void insertResume(Resume r) {
        storage[size] = r;
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */

    @Override
    protected Integer getSearchKey(String uuid) {
        for (int i = 0; i < size; i++) {
            if (uuid.equals(storage[i].getUuid())) {
                return i;
            }
        }
        return -1;
    }
}