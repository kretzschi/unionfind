/*
 * Copyright (C) 2015 Sascha Kretzschmann (ksascha@posteo.de)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * You should extend this class to implement your own union find data structure. It only contains
 * the three basic operations for an union find data structure inspired by the original paper of
 * Tarjan "A linear-time algorithm for a special case of disjoint set union" from 1983.
 *
 * @author Sascha Kretzschmann
 * @param <T> Generic type for the union find data structure.
 */
public abstract class AbstractUnionFind<T> {

    /**
     * Create a new singleton set {element} whose parent is element. This operation is only allowed
     * if element is in no existing set.
     *
     * @param element
     */
    public abstract void makeSet(T element);

    /**
     * Return the name of the set containing element. The name of the set is equal to its parent.
     *
     * @param element
     * @return Parent of set containing element.
     */
    public abstract T find(T element);

    /**
     * Create a new set that is the union of the sets containing element1 and element2. The name of
     * the new set depends on the strategy of the methos. This operation destroys the old sets
     * containing element1 and element2.
     *
     * @param element1
     * @param element2
     */
    public abstract void union(T element1, T element2);

}
