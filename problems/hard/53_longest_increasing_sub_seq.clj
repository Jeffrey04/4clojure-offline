; Given a vector of integers, find the longest consecutive sub-sequence of increasing numbers. If two sub-sequences have the same length, use the one that occurs first. An increasing sub-sequence must have a length of 2 or greater to qualify.
; http://www.4clojure.com/problem/53

; (= (__ [1 0 1 2 3 0 4 5]) [0 1 2 3])
; (= (__ [5 6 1 3 2 7]) [5 6])
; (= (__ [2 3 3 4 5]) [3 4 5])
; (= (__ [7 6 5 4]) [])

(fn [my-list]
    (let [sequences ((fn find-seq
            ([i-list] (find-seq [] i-list))
            ([result i-list]
                (if (zero? (count i-list))
                    result
                    (let [current (first i-list) next (rest i-list) head (drop-last result) tail (last result)]
                        (if (or (zero? (count result)) (not= (inc (last tail)) current))
                            (find-seq (conj (apply vector result) (vector current)) next)
                            (find-seq (conj (apply vector head) (conj tail current)) next))))))
        my-list)]
        (let [sequence-max (apply max (map count sequences))]
            (let [filtered-sequence (filter
                (fn [sequence]
                    (let [sequence-count (count sequence)]
                        (and (>= sequence-count 2)
                            (= sequence-count sequence-max))))
                sequences)]
                (if (zero? (count filtered-sequence)) [] (first filtered-sequence))))))
