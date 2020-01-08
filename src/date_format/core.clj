(ns date-format.core)

(defn create-sprints
  ([dates] (create-sprints dates 1 ""))
  ([dates sprint-number building]
   (if (> (count dates) 1)
   (let [current-date (peek dates)
         remaining (pop dates)
         next-date (peek remaining)
         next-sprint-number (+ sprint-number 1)
         sprint (str building "Sprint " (str sprint-number) ": " current-date " - " next-date "\n")
         ]
     (create-sprints remaining next-sprint-number sprint)
     )
   building
   )
   ))


(def sprint-dates (list
       "01/06"
       "01/20"
       "02/03"
       "02/17"
       "03/02"
       "03/30"
       "04/13"
       "04/27"
       "05/11"
       "05/25"
       "06/08"
       "06/22"
       "07/06"
       )
  )

(defn -main [& args]
  (let [
        to-print (create-sprints sprint-dates)
        ]
    (if to-print
      (println to-print)
      )
  ))


