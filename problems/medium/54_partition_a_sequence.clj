; Write a function which returns a sequence of lists of x items each.  Lists of less than x items should not be returned.
; http://www.4clojure.com/problem/54
; Don't use: partition, nor partition-all

; (= (__ 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8)))
; (= (__ 2 (range 8)) '((0 1) (2 3) (4 5) (6 7)))
; (= (__ 3 (range 8)) '((0 1 2) (3 4 5)))

(fn [n i-list]
    (filter
        #(= n (count %))
        (reduce
        (fn [current next]
            (let [head (drop-last current) tail (last current)]
                (if (nil? last) (vector next)
                    (if (= n (count tail))
                        (conj (apply vector current) (vector next))
                        (conj (apply vector head) (conj (apply vector tail) next))))))
        []
        i-list)))
