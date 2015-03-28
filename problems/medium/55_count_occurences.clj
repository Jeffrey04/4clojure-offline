; Write a function which returns a map containing the number of occurences of each distinct item in a sequence.
; http://www.4clojure.com/problem/55
; Don't use: frequencies

; (= (__ [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1})
; (= (__ [:b :a :b :a :b]) {:a 2, :b 3})
; (= (__ '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2})

(fn [i-list]
    (let [unique-list (reduce conj #{} i-list)]
        (apply hash-map
            (interleave
                unique-list
                (map
                    (fn [element]
                        (count (filter #(= element %) i-list)))
                    unique-list)))))
