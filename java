import React, { useState } from 'react';
import { Edit3, Send, Info, Award } from 'lucide-react';

export default function Bonkunfun() {
  const [headline] = useState("Local Man Arrested for Training Squirrels to Steal Expensive Watches");
  const [input, setInput] = useState("");

  return (
    <div className="min-h-screen bg-slate-50 font-sans text-slate-900">
      {/* Navigation */}
      <nav className="p-6 flex justify-between items-center border-b bg-white sticky top-0 z-10">
        <div className="flex items-center gap-2">
          <div className="bg-red-500 text-white p-2 rounded-lg font-black italic">B</div>
          <h1 className="text-2xl font-black tracking-tighter uppercase italic">Bonkunfun</h1>
        </div>
        <div className="flex gap-6 font-medium text-sm uppercase tracking-wider">
          <a href="#" className="hover:text-red-500">Play</a>
          <a href="#" className="hover:text-red-500">Leaderboard</a>
        </div>
      </nav>

      {/* Main Game Interface */}
      <main className="max-w-3xl mx-auto py-16 px-4">
        <div className="bg-white p-8 rounded-2xl shadow-xl border border-slate-200">
          <div className="mb-10 text-center">
            <span className="bg-red-100 text-red-600 px-3 py-1 rounded-full text-xs font-bold uppercase tracking-widest">The Satire</span>
            <h2 className="text-3xl font-serif mt-4 leading-snug">"{headline}"</h2>
          </div>

          <div className="space-y-6">
            <label className="block text-sm font-bold text-slate-500 uppercase">Make it "Unfun" (Realistic):</label>
            <textarea 
              className="w-full p-6 bg-slate-50 border-2 border-slate-100 rounded-xl focus:border-red-400 focus:bg-white outline-none transition-all text-lg font-serif italic"
              placeholder="Rewrite this to sound like a serious news report..."
              rows={4}
              value={input}
              onChange={(e) => setInput(e.target.value)}
            />
            
            <button className="w-full bg-slate-900 text-white py-4 rounded-xl font-bold flex items-center justify-center gap-2 hover:bg-red-600 transition-colors shadow-lg">
              <Send size={20} /> Submit for Review
            </button>
          </div>

          <div className="mt-12 grid grid-cols-1 md:grid-cols-2 gap-4">
            <div className="flex items-start gap-3 p-4 bg-blue-50 rounded-lg">
              <Info className="text-blue-500 shrink-0" size={20} />
              <p className="text-xs text-blue-700 leading-relaxed">
                <strong>The Goal:</strong> Humor often relies on absurdity. By removing the absurdity, we study what makes things "unfunny."
              </p>
            </div>
            <div className="flex items-start gap-3 p-4 bg-amber-50 rounded-lg">
              <Award className="text-amber-500 shrink-0" size={20} />
              <p className="text-xs text-amber-700 leading-relaxed">
                <strong>Scoring:</strong> Points are awarded based on how many people believe your version is a real headline.
              </p>
            </div>
          </div>
        </div>
      </main>
    </div>
  );
}
