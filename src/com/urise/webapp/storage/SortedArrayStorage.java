package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.Arrays;

public class SortedArrayStorage extends AbstractArrayStorage {

    @Override
    protected void deleteResume(int index){
        System.arraycopy(storage, index + 1, storage, index, size - 1 - index);
    }

    @Override
    protected void insertResume(Resume r) {
        int insertionPoint = (getSearchKey(r.getUuid()) + 1) * -1;
        System.arraycopy(storage, insertionPoint, storage, insertionPoint + 1, size - insertionPoint);
        storage[insertionPoint] = r;
    }

    @Override
    protected Integer getSearchKey(String uuid) {
        Resume searchKey = new Resume(uuid);
        return Arrays.binarySearch(storage, 0, size, searchKey);
    }
}
