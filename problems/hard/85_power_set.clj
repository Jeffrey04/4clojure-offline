; Write a function which generates the <a href="http://en.wikipedia.org/wiki/Power_set">power set of a given set.  The power set of a set x is the set of all subsets of x, including the empty set and x itself.
; http://www.4clojure.com/problem/85

; (= (__ #{1 :a}) #{#{1 :a} #{:a} #{} #{1}})
; (= (__ #{}) #{#{}})
; (= (__ #{1 2 3})    #{#{} #{1} #{2} #{3} #{1 2} #{1 3} #{2 3} #{1 2 3}})
; (= (count (__ (into #{} (range 10)))) 1024)

; (fn power-set [coll]
; 	(prn coll ":")
; 	(let [x (if (< (count coll) 2)
; 		#{coll}
; 		(set
; 			(for [elem    coll
; 						:let    [other (disj coll elem)]
; 						pairing (power-set other)]
; 				(do 
; 					(prn pairing " + " elem)
; 					(clojure.set/union pairing elem)))))] (do (prn x) (conj x #{}))))

