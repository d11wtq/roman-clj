(ns roman.core)

(def digits
  [["M" 1000]
   ["CM" 900]
   ["D" 500]
   ["CD" 400]
   ["C" 100]
   ["XC" 90]
   ["L" 50]
   ["XL" 40]
   ["X" 10]
   ["IX" 9]
   ["V" 5]
   ["IV" 4]
   ["I" 1]])

(defn numerals
  [n]
  (if-not (pos? n)
    ""
    (let [[s v] (->> digits (filter #(<= (second %) n)) first)]
      (str s (numerals (- n v))))))
